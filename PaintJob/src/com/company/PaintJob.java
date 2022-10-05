package com.company;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketCount = -1;
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            bucketCount = (int) Math.ceil(((width * height) / areaPerBucket)) - extraBuckets;
        }
        return bucketCount;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketCount = -1;
        if (width > 0 && height > 0 && areaPerBucket > 0) {
            bucketCount = (int) Math.ceil((width * height) / areaPerBucket);
        }
        return bucketCount;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketCount = -1;

        if (area > 0 && areaPerBucket > 0) {
            bucketCount = (int) Math.ceil(area / areaPerBucket);
        }
        return bucketCount;
    }
}
