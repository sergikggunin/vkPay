fun main() {
    val amount = 10000  // сумма перевода в рублях
    val minCommission = 35  // минимальная комиссия в рублях
    val commissionRate = 0.0075  // комиссия в процентах

    val commission = calculateCommission(amount, minCommission, commissionRate)

    println("Комиссия составит: $commission руб.")
}

fun calculateCommission(amount: Int, minCommission: Int, commissionRate: Double): Int {
    val commission = (amount * commissionRate).toInt()
    return if (commission > minCommission) commission else minCommission
}
