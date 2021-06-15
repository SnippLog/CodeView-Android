package io.github.kbiakov.codeviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.kbiakov.codeview.CodeView

class SwiftActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listings)

        findViewById<CodeView>(R.id.code_view).setCode(swiftCode, "swift")
    }

    private val swiftCode =
            """
                let maximumNumberOfLoginAttempts = 10
                var currentLoginAttempt = 0
                
                // Prints "Bonjour!"
                
                if name == "world" {
                    print("hello, world")
                } else {
                    print("I'm sorry \(name), but I don't recognize you")
                }
                
                for (index, value) in shoppingList.enumerated() {
                    print("Item \(index + 1): \(value)")
                }
                
                var airports: [String: String] = ["YYZ": "Toronto Pearson", "DUB": "Dublin"]
                
                repeat {
                    statements
                } while condition
                
                switch someCharacter {
                case "a":
                    print("The first letter of the alphabet")
                case "z":
                    print("The last letter of the alphabet")
                default:
                    print("Some other character")
                }
                
                if #available(iOS 10, macOS 10.12, *) {
                
                func sayHelloWorld() -> String {
                    return "hello, world"
                }
                
                enum Planet {
                    case mercury, venus, earth, mars, jupiter, saturn, uranus, neptune
                }
                
                struct SomeStructure {
                    // structure definition goes here
                }
                class SomeClass {
                    // class definition goes here
                }

                mutating func turnNorth() {
                    self = .north
                }
                
                subscript(index: Int) -> Int {
                    get {
                        // Return an appropriate subscript value here.
                    }
                    set(newValue) {
                        // Perform a suitable setting action here.
                    }
                }
                
                willSet(newTotalSteps) {
                    print("About to set totalSteps to \(newTotalSteps)")
                }
                didSet {
                    if totalSteps > oldValue  {
                        print("Added \(totalSteps - oldValue) steps")
                    }
                }

                init(wrappedValue: Int, maximum: Int) {
                    self.maximum = maximum
                    number = min(wrappedValue, maximum)
                }
                
                static subscript(n: Int) -> Planet {
                    return Planet(rawValue: n)!
                }
                
                convenience init(parameters)
                
                override init()
                
                if species.isEmpty { return nil }
                
                required init() {
                    // initializer implementation goes here
                }
                
                deinit {
                    // perform the deinitialization
                }
                
                throw VendingMachineError.insufficientFunds(coinsNeeded: 5)
                
                guard let item = inventory[name] else {
                    throw VendingMachineError.invalidSelection
                }
                
                do {
                    try buyFavoriteSnack(person: "Alice", vendingMachine: vendingMachine)
                    print("Success! Yum.")
                } catch VendingMachineError.invalidSelection

                defer {
                    close(file)
                }
                
                private(set) var max: Int
                
                extension TemperatureLogger {
                    print(logger.max)  // Error
                }
                
                if let movie = item as? Movie
                
                protocol SomeProtocol {
                    associatedtype Item
                }
                
                required override init() {
                    [unowned self, weak delegate = self.delegate]
                    // initializer implementation goes here
                }
                
                weak var delegate: DiceGameDelegate?
                
                func swapTwoInts(_ a: inout Int, _ b: inout Int)
            """.trimIndent()
}