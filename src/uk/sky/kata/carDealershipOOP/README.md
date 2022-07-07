**OOP Fundamentals Task**

**Objective: Create an application that can perform actions on a car 'database' using the OOP fundamentals we have just learnt!**

The actions that need to be performed are stated below:
1) create - add a car to the 'database'
2) get - return all cars in the 'database'
3) delete - delete a car from the 'database'

Within the carDealershipOOP project directory, you will find a CarDealershipApp.java file, this will be the starting point of 
your application.

As seen in the file, please use `List<Car> carList = new ArrayList<>()` as the database of cars. As you can see the list currently
equals `new ArrayList<>()` which is just an empty list!

**Task 1:**
This will test encapsulation!

Inside the model folder, there is a class called Car

Using encapsulation, can you make sure that a String id field is added to the class but cannot be changed.
The user must be able to retrieve the id however, they are not allowed to amend it.

The id needs to be set when the object is created, please can you set the id to autogenerate in the constructor using a random uuid.
The code for generating a random uuid string is:
`UUID.randomUUID().toString();`

**Task 2:**
Lets check out inheritance!

Inside the response folder, you will see a file called ResponseBase.java, this class contains 2 properties, errors and messages.
All responses from create, delete and list need to return errors and messages so this is a good base file to use.

When we perform the create functionality, we want to return a message to say 'your car has been created' as well as return the car itself or an error if it went wrong.
The ResponseBase class already covers messages and errors, and we do not want to repeat this code.
1) Using inheritance, can you create a class that has access to errors and messages as well as containing a Car property? Please call this class **CreateResponse**

Once you have done that, we must do the same for the get cars functionality, 

2) Can you create a class that has access to errors and messages but also contains a list of cars to return to the user, please call this class **ListResponse**

**Task 3:**

Let us now try some abstraction!

Inside the carDealershipOOP project directory, create a folder called service

inside the service folder, create an **_interface_** called **CarService**, in here we will write abstracted methods of what the car service needs to do
without actually implementing it!

1) Once your interface is created, please write a method called `create` that will create a car, the spec can be seen here:
 - `this method needs to return a type of CreateResponse that you created earlier`
 - `must take 2 parameters, a Car object and the car database which is of type List<Car>`
 
Remember as this is an interface, and we are doing abstraction, so don't actually write the implementation!

2) Now create another method that will list all the cars in the database called '`getCars`', the spec is below:
- `this method needs to return a type of ListResponse that you created earlier`
- `must take 1 parameter, the car database which is of type List<Car>`
3) Now create another method that will delete a car from the database, the spec is below:
- `this method needs to return a type of ResponseBase`
- `must take 2 parameters, a Car object and the car database which is of type List<Car>`

Now create a folder inside service called impl, this will house the implementation of our interfaces.

Once these methods have been abstracted, please create a new file inside the service->impl folder called CarServiceImpl
and using what you have learnt, implement your car service interface! This is where you will write the logic for the methods you wrote earlier!
In here, once you have implemented all your methods using the intellij shortcut, lets write the logic for them:

4) For the create method, add the car to the database, and return an CreateResponse object containing the car, and a success message

5) For the list, return an ListResponse object containing all the cars in the database with a success message

6) For delete, loop through the cars and delete the car from the list, return a ResponseBase object with a success message

**Task 4:**

Last one I promise! Polymorphism time!

Now lets say I wanted to add multiple cars to the database, but I still want my create method to be called the same thing...
Create a new Response object called CreateMultipleResponse, instead of having a single Car to return, this needs to return List<Car>

1) Create another method called `create` in your interface but this time it needs to take a list of cars instead of just 1

2) Implement this method in your impl file - add the list of cars provided to your car database and return a success message

3) Create another method called `delete`in your interface but this time instead of taking a car object, take a String id parameter instead

4) Implement this method in your impl file - loop through the car database and delete the car with the id provided

**Well done!**

You have now completed all the aspects of the car application, you can now uncomment the code in CarDealershipApp.java to see if your app works!
You may need to rename things if done slightly differently.

**_NOTE: You will need to add overridden toString methods to print your results out, example in your CreateResponse file:
super.toString() will call the toString from the parent ResponseBase class._**

`@Override
public String toString() {
return
super.toString() +
" createdCar= " + createdCar;
}`
