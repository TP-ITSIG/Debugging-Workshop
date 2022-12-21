class MainClass {
	constructor() {
		this.method();
	}

	method() {
		new OtherClass();
	}
}

class OtherClass {
	constructor() {
		this.method();
	}

	method() {
		throw new Error("Error thrown here")
	}
}

console.log("Code beings executing");
new MainClass();