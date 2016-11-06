var a = 0
var result = ""
while (a > 0) {
  result = result + a
  if (a > 1) result = result + ","
  a = a - 1
}
println(result)
