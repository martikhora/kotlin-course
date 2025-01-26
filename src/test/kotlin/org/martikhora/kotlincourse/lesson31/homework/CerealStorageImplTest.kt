package org.martikhora.kotlincourse.lesson31.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CerealStorageImplTest {

    private val storage = CerealStorageImpl(10f, 20f)

    @Test
    fun `throw if containerCapacity is negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-1f, 1f)
        }
    }

    @Test
    fun `throw if storageCapacity is lower than storageCapacity`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(20f, 10f)
        }
    }

    @Test
    fun `addCereal should return remaining amount when container is full`() {
        val remaining = storage.addCereal(Cereal.RICE, 15f)
        assertEquals(5f, remaining, 0.001f)
    }

    @Test
    fun `addCereal should return zero when all cereal fits in the container`() {
        val remaining = storage.addCereal(Cereal.RICE, 10f)
        assertEquals(0f, remaining, 0.001f)
    }

    @Test
    fun `getCereal should throw IllegalArgumentException if amount is negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            storage.getCereal(Cereal.RICE, -5f)
        }
    }

    @Test
    fun addCereal() = with(storage) {
        addCereal(Cereal.RICE, 5f)
        assertEquals(5f, getAmount(Cereal.RICE))
    }

    @Test
    fun addCerealTwice() = with(storage) {
        addCereal(Cereal.RICE, 5f)
        addCereal(Cereal.RICE, 5f)
        assertEquals(10f, getAmount(Cereal.RICE))
    }

    @Test
    fun getCereal() = with(storage) {
        addCereal(Cereal.RICE, 10f)
        val requestedAmount = storage.getCereal(Cereal.RICE, 5f)
        assertEquals(5f, requestedAmount, 0.001f)
        assertEquals(5f, storage.getAmount(Cereal.RICE), 0.001f)
    }

    @Test
    fun removeContainer() = with(storage) {
        addCereal(Cereal.RICE, 10f)
        getCereal(Cereal.RICE, 10f)
        val isRemoved = removeContainer(Cereal.RICE)
        assertTrue(isRemoved)
    }

    @Test
    fun removeContainerNotEmpty() = with(storage) {
        addCereal(Cereal.RICE, 10f)
        val isRemoved = removeContainer(Cereal.RICE)
        assertFalse(isRemoved)
    }

    @Test
    fun getAmount() = with(storage) {
        addCereal(Cereal.RICE, 5f)
        assertEquals(5f, getAmount(Cereal.RICE), 0.001f)
    }

    @Test
    fun getSpace() = with(storage) {
        addCereal(Cereal.RICE, 3f)
        assertEquals(7f, getSpace(Cereal.RICE), 0.001f)
    }

    @Test
    fun getContainerCapacity() = with(storage) {
        assertEquals(10f, containerCapacity, 0.001f)
    }

    @Test
    fun getStorageCapacity() = with(storage) {
        assertEquals(20f, storageCapacity, 0.001f)
    }
}