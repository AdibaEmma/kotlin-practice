class SimpleAgent(override val name: String) : Actor
{

     //   get() = TODO("Not yet implemented")


    override fun act(): Action
    {
      //  TODO("Not yet implemented")
        // val aName:ForageAction=ForageAction()
        var aForageAction:ForageAction =  ForageAction()
        println("aForageAction")
        return aForageAction

    }

    override fun perceive(vararg facts: Percept)
    {
        TODO("Not yet implemented")
    }


    override fun toString(): String
    {
        return name
    }
}