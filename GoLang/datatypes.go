package main
import "fmt"

func main(){

var f float64 =12
fmt.Println(f)
var flag bool =true
fmt.Println(flag) 


if 1==3{
	fmt.Println("hi")
}else if 2==2{
	fmt.Println("bi")
}else{
	fmt.Println("si")
}

var fptr=func()int{
	return 1
}

var arr :=int[]{1,2,3}
mpt.Println(arr[0])

fmt.Println(fptr())
}


// var arr =int[3]{1,2,3};

// for i=0;i<3;i++ {
// 	fmt.Println(arr[i])
// }