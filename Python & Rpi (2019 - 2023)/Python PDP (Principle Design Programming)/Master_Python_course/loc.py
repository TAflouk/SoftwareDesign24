import phonenumbers 
from phonenumbers import geocoder

num = "00353833535822"

ch_num = phonenumbers.parse(num,"CH")

print(geocoder.description_for_number(ch_num,"en"))

from phonenumbers import carrier

ser_num = phonenumbers.parse(num,"RO")

print(carrier.name_for_number(ser_num,"en"))

