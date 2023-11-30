package com.tirmizee.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RedisServiceTest {

    @Mock
    private RedisTemplate<String, Object> redisTemplate;

    @InjectMocks
    private RedisService redisService;

    @Test
    public void testSetValue() {
        String key = "testKey";
        String value = "testValue";

        // Mock the Redis operations
        ValueOperations<String, Object> valueOperations = mock(ValueOperations.class);
        when(redisTemplate.opsForValue()).thenReturn(valueOperations);

        // Call the method
        redisService.setValue(key, value);

        // Verify setValue is called
        verify(valueOperations, times(1)).set(key, value);
    }

    @Test
    public void testGetValue() {
        String key = "testKey";
        String expectedValue = "testValue";

        // Mock the Redis operations
        ValueOperations<String, Object> valueOperations = mock(ValueOperations.class);
        when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        when(valueOperations.get(key)).thenReturn(expectedValue);

        // Call the method
        Object actualValue = redisService.getValue(key);

        // Assert and verify
        assertEquals(expectedValue, actualValue);
        verify(valueOperations, times(1)).get(key);
    }

}
