/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt 
 * Description: JUnit tests for the CryptoManager class
 * Due: 10/18/2024 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently.  
*  I have not copied the code from a student or any source.  
*  I have not given my code to any student. 
*  Print your Name here: ______John Vu____
*/ 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CryptoManagerTestStudent {
	
	@BeforeEach
	public void setUp() throws Exception {
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testStringInBounds() {
		//default tests
		assertTrue(CryptoManager.isStringInBounds("JAVA"));
		assertTrue(CryptoManager.isStringInBounds("\"JAVA IS FUN\""));
		assertFalse(CryptoManager.isStringInBounds("java"));
		assertFalse(CryptoManager.isStringInBounds("{JAVA"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
		
		//student made tests
		
		assertTrue(CryptoManager.isStringInBounds(" !^_"));
		assertTrue(CryptoManager.isStringInBounds("ABC"));
		assertTrue(CryptoManager.isStringInBounds("AAAABC"));
		assertTrue(CryptoManager.isStringInBounds("!@#"));
		assertFalse(CryptoManager.isStringInBounds("abc"));
	}

	@Test
	public void testEncryptCaesar() {
		//default tests
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
		assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
		assertEquals("!\"#", CryptoManager.caesarEncryption("ABC", 96));
		assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
		assertEquals("UFTUJOH", CryptoManager.caesarEncryption("TESTING", 1));
		assertEquals("WKLV#LV#DQRWKHU#WHVW", CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 3));
		
		//student made tests
		assertEquals("\"# !", CryptoManager.caesarEncryption(" !^_", 2));
		assertEquals("123", CryptoManager.caesarEncryption("ABC", 240));
		
	}

	@Test
	public void testDecryptCaesar() {
		//default tests
		assertEquals("TESTING", CryptoManager.caesarDecryption("UFTUJOH", 1));
		assertEquals("TESTING ANOTHER STRING", CryptoManager.caesarDecryption(";,:;05.G(56;/,9G:;905.", 999));
		assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("4188;LC;>80", 300));
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
		
		//student made tests
		assertEquals("^_\\]", CryptoManager.caesarDecryption(" !^_", 2));
		assertEquals("QRS", CryptoManager.caesarDecryption("ABC", 240));
	}

	@Test
	public void testEncryptBellaso() {
		//default tests
		assertEquals("WN#\\N &", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.bellasoEncryption("MERRY CHRISTMAS", "HELLO"));
		assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));
		
		//student made tests
		assertEquals("UBQUCS", CryptoManager.bellasoEncryption("AAAABC", "TAP"));
		assertEquals("\"N7", CryptoManager.bellasoEncryption("!@#", "ANTON"));
		

	}

	@Test
	public void testDecryptBellaso() {
		//default tests
		assertEquals("TESTING", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));
		
		//student made tests

		assertEquals("-@1-A3", CryptoManager.bellasoDecryption("AAAABC", "TAP"));
		assertEquals(" 2O", CryptoManager.bellasoDecryption("!@#", "ANTON"));
	}

}
