Example Ajax Form.

SBT 0.11.3

To test: 

sbt 

container:start

point your browser at http://localhost:8080/

Entering the following into the form should yield the following results:

 * nothing = error message
 * you@example.com = notice 
 * me@example.com = redirect to / 

With 2.4 this works as expected with 2.5-SNAPSHOT the page displays the contents of the ajax request.
