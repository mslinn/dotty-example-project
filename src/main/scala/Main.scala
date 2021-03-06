@main def Main =
  runExample("New Syntax")(SyntaxNew)
  runExample("Trait Params")(TraitParams)
  runExample("Typeclasses")(Typeclasses)
  runExample("OpaqueTypes 1")(OpaqueTypes1)
  runExample("Delegates")(Delegates)
  runExample("Context Queries 1")(ContextQueries1)
  runExample("Intersection Types")(IntersectionTypes)
  runExample("Context Queries 2")(ContextQueries2)
  runExample("OpaqueTypes 2")(OpaqueTypes2)
  runExample("Type Lambdas")(TypeLambdas)
  runExample("Enum Types")(EnumTypes)
  runExample("Conversion")(Conversion)
  runExample("Multiversal Equality")(MultiversalEquality)
  runExample("Named Type Arguments")(NamedTypeArguments)
  runExample("Automatic Functional Parameter Tupling")(AutoParamTupling)
  runExample("Structural Types")(StructuralTypes)
  runExample("Pattern Matching")(PatternMatching)
  runExample("Union Types")(UnionTypes)

private def runExample(name: String)
                      (f: => Unit) =
  println(Console.MAGENTA + s"$name example:" + Console.RESET)
  f
  println()
