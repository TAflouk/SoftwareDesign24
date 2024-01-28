

    package Newsagent;

    public class DeliveryDriver{

        private int id;
        private String name;
        private String surname;
        private String phoneNumber; 
        private String Address;
        private int pin;
        
        public DeliveryDriver(int id, String name, String surname, String phoneNumber, String address, int pin,
				boolean resetPinOptionVisible, boolean loginWindowDisplayed) {
			super();
			this.id = id;
			this.name = name;
			this.surname = surname;
			this.phoneNumber = phoneNumber;
			Address = address;
			this.pin = pin;
			this.resetPinOptionVisible = resetPinOptionVisible;
			this.loginWindowDisplayed = loginWindowDisplayed;
		}
        public DeliveryDriver() {

		}
        
		private boolean resetPinOptionVisible;
        private boolean loginWindowDisplayed;

        public boolean verifyName(String name) throws NewsagentExceptionHandler {
            if (name == null) {
                throw new NewsagentExceptionHandler("Enter name cannot be null");
            }
            if (name.length() < 4) {
                throw new NewsagentExceptionHandler("Enter name is too short");
            }
            if (name.length() > 10) {
                throw new NewsagentExceptionHandler("Enter name is too long");
            }
            if (!name.matches("[a-zA-Z ]*")) {
                throw new NewsagentExceptionHandler("Invalid name");
            }
            this.name = name;
            return true;
        }



        public boolean verifyPinNumber(int pin) throws NewsagentExceptionHandler {
        	
            if (pin < 1000 || pin > 9999) {
                throw new NewsagentExceptionHandler("Invalid PIN number");
            }
            this.pin = pin;
            return true;
        }
        
        public boolean verifyIdNumber(int id) throws NewsagentExceptionHandler {
            if (id < 1 || id > 99999) {
                throw new NewsagentExceptionHandler("Invalid ID number");
            }
            this.id = id;
            return true;
        }
        public boolean anotherAttempt() throws NewsagentExceptionHandler {
            return true;
        }

        public boolean getUserAccess() throws NewsagentExceptionHandler {
            return true;
        }

        public boolean isResetPinOptionVisible() throws NewsagentExceptionHandler {
            return resetPinOptionVisible;
        }

        public boolean verifyIdNumberSecondAttempt(int id) throws NewsagentExceptionHandler {
            if (id < 1 || id > 99999) {
                throw new NewsagentExceptionHandler("Invalid ID number");
            }
            this.id = id;
            return true;
        }

        public boolean verifyPinNumberSecondAttempt(int pin) throws NewsagentExceptionHandler {
            if (pin < 1000 || pin > 9999) {
                throw new NewsagentExceptionHandler("Invalid PIN number");
            }
            this.pin = pin;
            return true;
        }

        public boolean anotherAttemptSecondAttempt() throws NewsagentExceptionHandler {
            return true;
        }

        public boolean getUserAccessSecondAttempt() throws NewsagentExceptionHandler {
            return true;
        }

        public boolean isResetPinOptionVisibleSecondAttempt() throws NewsagentExceptionHandler {
            return resetPinOptionVisible;
        }

        public boolean verifyIdNumberThirdAttempt(int id) throws NewsagentExceptionHandler {
            if (id < 1 || id > 99999) {
                throw new NewsagentExceptionHandler("Invalid ID number");
            }
            this.id = id;
            return true;
        }

        public boolean verifyPinNumberThirdAttempt(int pin) throws NewsagentExceptionHandler {
            if (pin < 1000 || pin > 9999) {
                throw new NewsagentExceptionHandler("Invalid PIN number");
            }
            this.pin = pin;
            return true;
        }

        public boolean anotherAttemptThirdAttempt() throws NewsagentExceptionHandler {
            return true;
        }


        public void resetPin() {
            resetPinOptionVisible = false;
        }

        public void unsuccessfulResetPin() {
            resetPinOptionVisible = true;
        }

        public void multipleUnsuccessfulAttempts() {
            resetPinOptionVisible = false;
        }
//        public DeliveryDriver() throws NewsagentExceptionHandler {
//            this.loginWindowDisplayed = true; 
//        }

        public boolean isLoginWindowDisplayed() throws NewsagentExceptionHandler {
            if (loginWindowDisplayed) {
                return true;
            } else {
                throw new NewsagentExceptionHandler("Login window is not displayed");
            }
        }


        public boolean verifySurname(String surname) throws NewsagentExceptionHandler {
            if (surname == null || !surname.matches("[a-zA-Z ]*")) {
                throw new NewsagentExceptionHandler("Invalid surname");
            }
            this.surname = surname;
            return true;
        }
        public boolean verifyPhoneNumber(String phoneNumber) throws NewsagentExceptionHandler {
            if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
                throw new NewsagentExceptionHandler("Invalid phone number");
            }

            String cleanedNumber = phoneNumber.replaceAll("[^0-9]", "");

            if (cleanedNumber.length() == 10) {
                this.phoneNumber = phoneNumber;
                return true;
            } else {
                throw new NewsagentExceptionHandler("Invalid phone number");
            }
        }
        public boolean verifyAddress(String address) throws NewsagentExceptionHandler {
            if (address == null || address.isEmpty()) {
                throw new NewsagentExceptionHandler("Invalid address");
            }

       
            if (address.matches("^[a-zA-Z0-9, &-]+$")) {
                return true;
            }

            if (address.matches("^[a-zA-Z0-9, -]+$")) {
                return true;
            }

            // All other cases are considered invalid
            throw new NewsagentExceptionHandler("Invalid address");
        }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		public void setResetPinOptionVisible(boolean resetPinOptionVisible) {
			this.resetPinOptionVisible = resetPinOptionVisible;
		}

		public void setLoginWindowDisplayed(boolean loginWindowDisplayed) {
			this.loginWindowDisplayed = loginWindowDisplayed;
		}

    }
    
