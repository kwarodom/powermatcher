package net.powermatcher.core.testsuite;

import net.powermatcher.core.auctioneer.test.AuctioneerTest;
import net.powermatcher.core.auctioneer.test.ObjectiveAuctioneerTest;
import net.powermatcher.core.concentrator.test.ConcentratorTest;
import net.powermatcher.core.concentrator.test.PeakShavingConcentratorTest;
import net.powermatcher.core.monitoring.test.ObservableAgentTest;
import net.powermatcher.core.sessions.test.SessionManagerTest;
import net.powermatcher.core.test.BidCacheTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AuctioneerTest.class, ObjectiveAuctioneerTest.class, ConcentratorTest.class,
        PeakShavingConcentratorTest.class, ObservableAgentTest.class, SessionManagerTest.class, BidCacheTest.class })
public class CoreTestSuite {

}