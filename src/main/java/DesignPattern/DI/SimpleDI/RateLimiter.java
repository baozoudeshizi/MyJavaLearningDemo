package DesignPattern.DI.SimpleDI;

public class RateLimiter {
    private RedisCounter redisCounter;
    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }
    public boolean isValid() {
        this.redisCounter.increamentAndGet();
        return true;
    }
}
