The Decorator Pattern allows you to add new behavior or features to an object at runtime, without modifying its original class.
<br>
It is used when:<br>
•	You want to add features dynamically.<br>
•	You want composable features (stack multiple features).<br>
•	You want to avoid subclass explosion (too many subclasses).<br>

Imagine a coffee:

Base coffee:
•	Plain Coffee → ₹100

Now add toppings:
•	Add Milk (+₹20)
•	Add Sugar (+₹10)
•	Add Whipped Cream (+₹30)

You can choose any combination:
•	Coffee + Milk
•	Coffee + Milk + Cream
•	Coffee + Sugar + Cream
•	etc.

Each topping wraps the previous object and adds its own cost.