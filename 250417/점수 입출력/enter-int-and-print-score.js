const fs = require("fs");
let N = Number(fs.readFileSync(0).toString().trim());
console.log("Your score is", N, "point.");