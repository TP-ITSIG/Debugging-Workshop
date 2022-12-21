import factorial from "./factorial"

test("Positive numbers", () => {
	expect(factorial(3)).toBe(6);
	expect(factorial(10)).toBe(3628800);
})

test("Zero", () => {
	expect(factorial(0)).toBe(1);
})

test("Negative numbers", () => {
	expect(factorial(-1)).toBe(1);
	expect(factorial(-10)).toBe(1);
})