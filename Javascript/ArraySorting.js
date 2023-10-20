const ar=[1,20,13,44,5,60,27,8];
for(i=0;i<ar.length;i++){
    for(j=i+1;j<ar.length;j++){
        if(ar[i]<ar[j]){
      let temp = ar[i]
        ar[i] = ar[j]
        ar[j] = temp;
        }
    }
}
for(i=0;i<ar.length;i++){
    console.log(ar[i])
}