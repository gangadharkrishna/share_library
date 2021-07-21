def call(String designation = 'null') {
	echo "This is shared library sendoffUser: ${DESG}"
	pipeline {
		environment {
			DESG_NAME = "${DESG}"
		}
		agent any 
		stages {
			stage('SENDOF_USER') {
				steps {
					//echo "Bye $USER_NAME, Nice meeting you !"
					echo "Designation is  $DESG_NAME"
				}	
			}
		}
	}
}
