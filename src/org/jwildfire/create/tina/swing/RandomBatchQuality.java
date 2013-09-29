package org.jwildfire.create.tina.swing;

public enum RandomBatchQuality {
  LOW {
    @Override
    public double getCoverage() {
      return 0.33;
    }

    @Override
    public int getMaxSamples() {
      return 10;
    }
  },
  NORMAL {
    @Override
    public double getCoverage() {
      return 0.42;
    }

    @Override
    public int getMaxSamples() {
      return 50;
    }
  },
  HIGH {
    @Override
    public double getCoverage() {
      return 0.8;
    }

    @Override
    public int getMaxSamples() {
      return 150;
    }
  };

  public abstract double getCoverage();

  public abstract int getMaxSamples();
}
