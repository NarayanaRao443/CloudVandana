
function reverseWords(str){
    const words = str.split(' '); 
    const reverseWords = words.map(word=> word.split('').reverse().join(''));
    const reverseStr = reverseWords.join(' '); 
    return reverseStr; 
  }
  const str = "This is a sunny day";
  const revsent = reverseWords(str)
  console.log(revsent)