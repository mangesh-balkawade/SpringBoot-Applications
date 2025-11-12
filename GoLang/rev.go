package main
import "fmt"

func add(arr ... int)int{
	var sum int=0
	
	for i:=0;i<len(arr);i++{
		sum+=arr[i]
	}

	return sum
}

func main(){
	var op int =0;
	op=add(1,2,3,4)
	fmt.Println(op)

	var arr [5]int
	arr[2]=10
	fmt.Println(arr[3])

 var arr2 = [5]int {1,2,3,4,5}
 fmt.Println(arr2[4])

 fmt.Print(&arr2)


  

}