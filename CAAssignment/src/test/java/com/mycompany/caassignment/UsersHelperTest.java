/*
 * Copyright (C) 2016 Dietmar.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package com.mycompany.caassignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dietmar
 */
public class UsersHelperTest {
    
    public UsersHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of auth method, of class UsersHelper.
     */
    @Test
    public void testAuth() throws Exception {
        System.out.println("auth");
        String email = "test@test.com";
        String password = "secret";
        UsersHelper instance = new UsersHelper();
        int expResult = 0;
        int result = instance.auth(email, password);
        assertEquals(expResult, result);
        email = "test@test.com";
        password = "secret";
 
    }

    /**
     * Test of updatePassword method, of class UsersHelper.
     */
    @Test
    public void testUpdatePassword() throws Exception {
        System.out.println("updatePassword");
        String email = "test@test.com";
        String password = "secret";
        UsersHelper instance = new UsersHelper();
        int expResult = 0;
        int result = instance.updatePassword(email, password);
        assertEquals(expResult, result);
    }
    
}
