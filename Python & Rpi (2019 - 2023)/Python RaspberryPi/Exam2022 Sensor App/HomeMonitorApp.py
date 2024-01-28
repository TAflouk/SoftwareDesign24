from Sensor import Sensor as s



if __name__ == "__main__":
    ask_user = input("Would you like to create/add a sensor(yes/no): ").lower()
    list_of_sensors = []
    while(ask_user == "yes"):
        room = input("Enter the room: ").lower()
        type_of_Sensor = input("Enter the type of the Sensor(temperature/humidity): ").lower()
        s1 = s(room, type_of_Sensor)
        print(s1)
        list_of_sensors.append(s1)
        ask_user = input("Would you like to create/add a sensor(yes/no): ").lower()
        for i in range(3):
            list_of_sensors.append(s("Bathroom", "humidity"))
            list_of_sensors.append(s("Bathroom", "temperature"))
            
        print("Room\tSensorType\tReading Status\tReding status")
        status = ""

        for i in range(len(list_of_sensors)):
            if list_of_sensors[i].value < 14:
                status = "Cold "
                
            if 15 < list_of_sensors[i].value < 22 :
                status = "Comfortable "
                
            if list_of_sensors[i].value > 22:
                status = "hot "
            
            if list_of_sensors[i].value < 55:
                status = "dry"
                
            if list_of_sensors[i].value >= 55  and list_of_sensors[i].value <= 65:
                status = "Sticky"
                
            if list_of_sensors[i].value > 65:
                status = "Oppressive"

            print(f"{list_of_sensors[i].room}\t{list_of_sensors[i].type_of_sensor}\t{list_of_sensors[i].value}\t{status}")
    print("Thank you for using the application")
    