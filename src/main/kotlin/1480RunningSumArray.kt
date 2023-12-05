val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    var sumRanning = RunningSum()
    println(sumRanning.runningSum(intArrayOf(1,2,3,4)).contentToString())
}
class RunningSum{
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] = nums[i] + nums[i-1]
        }
        return nums
    }
}