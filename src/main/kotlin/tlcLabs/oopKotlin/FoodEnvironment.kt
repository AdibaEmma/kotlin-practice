class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {

    var scores :MutableMap<Actor, Int> = mutableMapOf<Actor,Int>()
    var aForageAction:ForageAction =  ForageAction()
    var aActor:SimpleAgent =  SimpleAgent("Jane")
    var theScore:Int = 0

    init
    {
        scores.put(aActor,theScore)
       // print("Class instance is initialised.")
    }


    override fun processAction(agent: Actor, act: Action)
    {
        //TODO("Not yet implemented")
        aActor.act();
        scores.put(aActor,(theScore+1))
    }

    override fun sense(agent: Actor)
    {
        println("do nothing")
        //TODO("Not yet implemented")
    }
}