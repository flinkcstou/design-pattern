class SingletonTs {

  private static singleton = new SingletonTs();

  private constructor() {
    console.error('constructor');
  }

  public static getInstance(): SingletonTs {
    return this.singleton;
  }
}

SingletonTs
