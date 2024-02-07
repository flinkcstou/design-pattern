var SingletonJs = (function () {

  var counter = 0;

  function increase() {
    counter++
    return counter
  }

  function decrease() {
    counter--;
    return counter
  }

  return {
    increase,
    decrease
  }
}())

console.error(SingletonJs)

console.error(SingletonJs.increase())
console.error(SingletonJs.increase())
