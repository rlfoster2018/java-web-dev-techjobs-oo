package org.launchcode.techjobs_oo;

import java.util.Objects;

    public class JustInCase {
        private int id;
        private static int nextId = 1;
        private String value;

        public JustInCase() {
            id = nextId;
            nextId++;
        }

        public JustInCase(String value) {
            this();
            this.value = value;
        }

        // Custom toString, equals, and hashCode methods:

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof org.launchcode.techjobs_oo.JustInCase)) return false;
            org.launchcode.techjobs_oo.JustInCase justInCase = (org.launchcode.techjobs_oo.JustInCase) o;
            return getId() == justInCase.getId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }

        // Getters and Setters:

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
