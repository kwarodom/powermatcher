package net.powermatcher.integration.concentrator;

import java.io.IOException;
import java.util.zip.DataFormatException;

import net.powermatcher.api.data.ArrayBid;
import net.powermatcher.integration.base.ConcentratorResilienceTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Concentrator quality test with focus on scalability.
 */
public class ConcentratorResilienceTestICQ extends ConcentratorResilienceTest {

//    @Rule
//    public ExpectedException exception = ExpectedException.none();
    
    /**
     * A large set of agents send a bid to the matcher via the concentrator.
     * 
     * Check if the concentrator publishes the correct aggregated bid.
     * 
     * @throws IOException
     * @throws DataFormatException
     */
    @Test
    public void qualityScalabilityTestICQ1SendAggregatedLarge() throws IOException, DataFormatException {
        performAggregatedBidTest("ICQ/ICQ1", null);
    }

    @Test
    public void qualityScalabilityTestICQ2SendAggregatedBidRejectAscending() throws IOException, DataFormatException {
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("No session found");
        performAggregatedBidTest("ICQ/ICQ2", null);
    }

    private void performAggregatedBidTest(String testID, String suffix) throws IOException, DataFormatException {
        prepareTest(testID, suffix);

        sendBidsToMatcher();

        checkAggregatedBid((ArrayBid)this.auctioneer.getLastReceivedBid());
    }
}
