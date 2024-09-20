/*************************************************
 * @copyright 2017 Flision Corporation Inc.
 * @author: Vincent Chan @ Canton
 * @date: 2024年09月20日
 * @version: 1.0.0
 * @description:
 **************************************************/
package com.dji.sdk.cloudapi.media;

import java.util.StringJoiner;

public class FileUploadCallbackFlightTask {

    Integer expectedFileCount;
    Integer flightType;
    Integer uploadedFileCount;

    public Integer getExpectedFileCount() {
        return expectedFileCount;
    }

    public void setExpectedFileCount(Integer expectedFileCount) {
        this.expectedFileCount = expectedFileCount;
    }

    public Integer getFlightType() {
        return flightType;
    }

    public void setFlightType(Integer flightType) {
        this.flightType = flightType;
    }

    public Integer getUploadedFileCount() {
        return uploadedFileCount;
    }

    public void setUploadedFileCount(Integer uploadedFileCount) {
        this.uploadedFileCount = uploadedFileCount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FileUploadCallbackFlightTask.class.getSimpleName() + "[", "]")
          .add("expectedFileCount=" + expectedFileCount)
          .add("flightType=" + flightType)
          .add("uploadedFileCount=" + uploadedFileCount)
          .toString();
    }
}
