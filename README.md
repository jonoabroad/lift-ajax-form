Example Ajax Form.

SBT 0.11.3

To test: 

sbt 

container:start

point your browser at http://localhost:8080/

Entering the following into the form should yield the following results:

 * nothing = expected S.error message
 * you@example.com = notice 
 * me@example.com = redirect to / 

For the final example running Lift 2.4, this works as expected. Running with 2.5-SNAPSHOT the page displays the contents of the ajax request, rather than redirecting to /
