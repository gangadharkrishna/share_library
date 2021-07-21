def call(String username = 'null') {
	echo "This is shared library sendoffUser: ${username}"
	pipeline {
		environment {
			
			DESG = "${designation}"
		}
		agent any 
		stages {
			stage('SENDOF_USER') {
				steps {
					echo "Bye $USER_NAME, Nice meeting you !"
					echo "Designation: $DESG"
				}	
			}
		}
	}
}
