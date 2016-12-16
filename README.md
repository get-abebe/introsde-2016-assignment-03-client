# introsde-2016-assignment-03-client
** Assignment 03: SOAP Web Services

** Name: Getachew Demissie Abebe

I have done both server and client by myself

The server is deployed on heroku and its url is => https://young-lowlands-83639.herokuapp.com/soap/people?wsdl

                      ** Implemented Services using JAX-WS 
Method #1: readPersonList() => This method list all the people in the my database.

Method #2: readPerson(Long id) => Displays all the Personal information plus current health profile of person with id = 52.

Method #3: updatePerson(Person p) => Update the Personal information of the Person identified by {id = 52}.

Method #4: createPerson(Person p) => It create a new Person (personal information not heaalth profile) and return the newly created Person with its assigned id.

Method #5: deletePerson(Long id) => This method delete the Person created in the above steps from the system.

Method #6: readPersonHistory(Long id, String measureType) => It return the list of values (the history) of weight for Person identified by id = 53

Method #7: readMeasureTypes() => Return the list of measures supported by the system.

Method #8: readPersonMeasure(Long id, String measureType, Long mid) => It return the value of weight identified by {mid = 3} for Person identified by id = 52

Method #9: savePersonMeasure(Long id, Measure m) =>It save a new measure object weight of Person identified by id = 101 and archive the old value in the history

Method #10: updatePersonMeasure(Long id, Measure m) => It update the measure identified with weight and mid = 1, related to the Person identified by id = 201

                            ** Check WSDL 
==> The server is deployed on heroku and its url is ====> https://young-lowlands-83639.herokuapp.com/soap/people?wsdl

==> You can check by opening it on the web browser.

==> To execute the Client,first clone the repositery to your local machine, then run ant install, and run ant execute.client. And finally, press enter to see all the outputs.

==> The log file is attached in the server repository by the name log.xml
