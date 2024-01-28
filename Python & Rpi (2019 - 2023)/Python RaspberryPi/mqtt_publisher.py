import os
import time
import psutil
import paho.mqtt.client as mqtt

# MQTT Broker Settings
broker_address = "192.168.1.106"
broker_port = 1883
topic_ram = "raspberrypi3TAflouk/ram"
topic_temp = "raspberrypi/temperature"

# Function to get RAM usage
def get_ram_usage():
    ram = psutil.virtual_memory()
    return f"Total: {ram.total}, Used: {ram.used}, Free: {ram.available}"

# Function to get CPU temperature
def get_cpu_temperature():
    cpu_temp = os.popen("vcgencmd measure_temp").readline().strip()
    return cpu_temp[5:]

# Callback when the client connects to the MQTT broker
def on_connect(client, userdata, flags, rc):
    print("Connected to MQTT broker with result code "+str(rc))

# Create an MQTT client instance
client = mqtt.Client()

# Set the callback functions
client.on_connect = on_connect

# Connect to the broker
client.connect(broker_address, broker_port, 60)

# Start the loop
client.loop_start()

try:
    while True:
        # Get RAM usage and CPU temperature
        ram_info = get_ram_usage()
        cpu_temp = get_cpu_temperature()

        # Publish the values to the MQTT topics
        client.publish(topic_ram, ram_info)
        client.publish(topic_temp, cpu_temp)

        # Wait for a specified interval (e.g., 10 seconds)
        time.sleep(10)

except KeyboardInterrupt:
    # Handle Ctrl+C to gracefully exit the script
    print("\nScript terminated by user.")
    client.disconnect()
    client.loop_stop()
