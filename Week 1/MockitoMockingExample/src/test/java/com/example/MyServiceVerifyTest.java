package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceVerifyTest {

    @Test
    public void testVerifyInteraction() {

        // Step 1: create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: inject mock into service
        MyService service = new MyService(mockApi);

        // Step 3: call method
        service.fetchData();

        // Step 4: verify interaction
        verify(mockApi).getData();
    }
}