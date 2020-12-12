import org.junit.Test
import org.junit.Assert.*
import org.junit.Ignore

class MoneyKtTest {

    @Test
    fun calculationOfCommissionMastercardOrMaestroWithLimit() {
        val previousTransfers = 100_00
        val amountTest = 100_000_00
        val cardTypeTest = "Mastercard"

        val result = calculationOfCommission(
            amountOfPreviousTransfers = previousTransfers,
            amount = amountTest,
            cardType = cardTypeTest
            )
        assertEquals(620000, result)
    }

    @Test
    fun calculationOfCommissionMastercardOrMaestroWithoutLimit() {
        val previousTransfers = 100_00
        val amountTest = 100_00
        val cardTypeTest = "Mastercard"

        val result = calculationOfCommission(
            amountOfPreviousTransfers = previousTransfers,
            amount = amountTest,
            cardType = cardTypeTest
        )
        assertEquals(0, result)
    }


    @Test
    fun calculationOfCommissionVKPay() {
        val previousTransfers = 100_00
        val amountTest = 10_000_00
        val cardTypeTest = "VK Pay"

        val result = calculationOfCommission(
            previousTransfers,
            amountTest,
            cardTypeTest
        )
        assertEquals(0, result)
    }


    @Test
    fun calculationOfCommissionDefault() {
        val previousTransfers = 100_00
        val amountTest = 100_000_00

        val result = calculationOfCommission(
            amountOfPreviousTransfers = previousTransfers,
            amount = amountTest
        )
        assertEquals(0, result)
    }

    @Test
    fun calculationOfCommissionVisaAbove35() {
        val previousTransfers = 100_00
        val amountTest = 100_000_00
        val cardTypeTest = "Visa"

        val result = calculationOfCommission(
            amountOfPreviousTransfers = previousTransfers,
            amount = amountTest,
            cardType = cardTypeTest
        )
        assertEquals(75_000, result)
    }

    @Test
    fun calculationOfCommissionMirAbove35() {
        val previousTransfers = 100_00
        val amountTest = 100_000_00
        val cardTypeTest = "Мир"

        val result = calculationOfCommission(
            amountOfPreviousTransfers = previousTransfers,
            amount = amountTest,
            cardType = cardTypeTest
        )
        assertEquals(75_000, result)
    }

    @Test
    fun calculationOfCommissionVisa35() {
        val previousTransfers = 100_00
        val amountTest = 100_00
        val cardTypeTest = "Visa"

        val result = calculationOfCommission(
            amountOfPreviousTransfers = previousTransfers,
            amount = amountTest,
            cardType = cardTypeTest
        )
        assertEquals(3500, result)
    }

    @Test
    fun calculationOfCommissionMir35() {
        val previousTransfers = 100_00
        val amountTest = 100_00
        val cardTypeTest = "Мир"

        val result = calculationOfCommission(
            amountOfPreviousTransfers = previousTransfers,
            amount = amountTest,
            cardType = cardTypeTest
        )
        assertEquals(3500, result)
    }
}