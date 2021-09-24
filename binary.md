### What is base x?
Base x means that there are x possible values for each digit in the number. Each place value represents a power of x, starting with the rightmost place and moving left with x<sup>0</sup>, then x<sup>1</sup>, etc. 
Base two means that there are two possible values per digit and base ten means that there are ten possible values/digit.

### What is binary?
Binary is a system of displaying information in the form of 0s and 1s, ons and offs, or trues and falses. It is a base two system. It's an easy way to share a value, and computers interpret binary and return information that is useful for us. This is because transistors are can only be on or off values.

### Binary to decimal
Multiply the rightmost digit by 2<sup>0</sup>, then 2<sup>1</sup> for the second rightmost digit until each digit has been multiplied.
Store these products and add them to get the decimal value.

<details>
<summary>Example</summary>
<ol start="0">
  <li>Start with 1101<sub>2</sub>.</li>
  <li>We would start with the last digit (1), multiply it by 2^0, get 1, and move on to the next digit until each digit has been multiplied.</li>
  <li>The products will be 1, 0, 4, and 8 which adds up to 13.</li>
</ol>
Result: 1101<sub>2</sub> = 13<sub>10</sub><br/>
</details>

### Decimal to binary
Create a variable with the value of 0 to store the binary number.  
Loop through the powers of two until a power of two is greater than the decimal number.  
Subtract 2<sup>n</sup>, where n is the greatest power of two less than the decimal number, from the decimal number.  
Add 10<sup>n</sup>, where n is the greatest power of two less than the decimal number, to the binary number.  
Repeat last three steps with the new decimal number until decimal number is zero.

<details>
<summary>Example</summary>  
<ol start="0">
  <li>Start with 40<sub>10</sub>.</li>
  <li>Subtract 2<sup>0</sup>, 2<sup>1</sup>, and so on from the decimal number until we get a negative difference.</li>
  <li>Because 2<sup>6</sup> > 40, we will subtract 2<sup>5</sup> instead, resulting in the new decimal number being 8.</li>
  <li>We will add 10^5 to the binary number, it is now 100000.  <li>Repeat last 3 steps with 8<sub>10</sub> because decimal number is not 0 yet.</li>
  <li>Subtract 2<sup>0</sup>, 2<sup>1</sup>, and so on from the decimal number until we get a negative difference.</li>
  <li>Because 2<sup>4</sup> > 8, we will subtract 2<sup>3</sup> instead, resulting in the new decimal number being 0.</li>
  <li>We will add 10^3 to the binary number, it is now 101000.</li>
  <li>Because the decimal number is 0, we have successfully found 40<sub>10</sub> in binary.</li>
</ol>
Result: 40<sub>10</sub> = 101000<sub>2</sub>
</details>

