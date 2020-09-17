package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job fullJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(fullJob.getName(), "Product Tester");
        assertEquals(fullJob.getEmployer().getValue(), "ACME");
        assertEquals(fullJob.getLocation().getValue(), "Desert");
        assertEquals(fullJob.getPositionType().getValue(), "Quality Control");
        assertEquals(fullJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job fullJob1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job fullJob2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(fullJob1.equals(fullJob2));
        assertEquals(fullJob1.getName(), fullJob2.getName());
        assertEquals(fullJob1.getEmployer().getValue(), fullJob2.getEmployer().getValue());
    }

}
