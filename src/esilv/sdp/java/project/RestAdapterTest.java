package esilv.sdp.java.project;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class RestAdapterTest {

    private RestAdapter restAdapter;

    @Mock
    RestService mockService;

    @BeforeEach void setUp() {
        MockitoAnnotations.initMocks(this);
        restAdapter = new RestAdapter(mockService);
    }

    @Test
    public void test_workingService_expectTrue() {
        //prepare
        when(mockService.isWorking()).thenReturn(true);
        //call
        boolean result = restAdapter.start();
        //verify
        Assert.assertTrue(result);
    }

}