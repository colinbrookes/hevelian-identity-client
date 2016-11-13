/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hevelian.identity.client.api;

import com.hevelian.identity.client.ApiCallback;
import com.hevelian.identity.client.ApiClient;
import com.hevelian.identity.client.ApiException;
import com.hevelian.identity.client.ApiResponse;
import com.hevelian.identity.client.Configuration;
import com.hevelian.identity.client.Pair;
import com.hevelian.identity.client.ProgressRequestBody;
import com.hevelian.identity.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.hevelian.identity.client.model.TenantDomainDTO;
import com.hevelian.identity.client.model.TenantRequestDTO;
import com.hevelian.identity.client.model.PrimitiveResultstring;
import com.hevelian.identity.client.model.Tenant;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TenantcontrollerApi {
    private ApiClient apiClient;

    public TenantcontrollerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TenantcontrollerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for activateTenantUsingPOST */
    private com.squareup.okhttp.Call activateTenantUsingPOSTCall(TenantDomainDTO tenantDomainDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tenantDomainDTO;
        
        // verify the required parameter 'tenantDomainDTO' is set
        if (tenantDomainDTO == null) {
            throw new ApiException("Missing the required parameter 'tenantDomainDTO' when calling activateTenantUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/TenantService/activateTenant".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "default" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * activateTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void activateTenantUsingPOST(TenantDomainDTO tenantDomainDTO) throws ApiException {
        activateTenantUsingPOSTWithHttpInfo(tenantDomainDTO);
    }

    /**
     * activateTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> activateTenantUsingPOSTWithHttpInfo(TenantDomainDTO tenantDomainDTO) throws ApiException {
        com.squareup.okhttp.Call call = activateTenantUsingPOSTCall(tenantDomainDTO, null, null);
        return apiClient.execute(call);
    }

    /**
     * activateTenant (asynchronously)
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call activateTenantUsingPOSTAsync(TenantDomainDTO tenantDomainDTO, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = activateTenantUsingPOSTCall(tenantDomainDTO, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for addTenantUsingPOST */
    private com.squareup.okhttp.Call addTenantUsingPOSTCall(TenantRequestDTO tenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tenant;
        
        // verify the required parameter 'tenant' is set
        if (tenant == null) {
            throw new ApiException("Missing the required parameter 'tenant' when calling addTenantUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/TenantService/addTenant".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "default" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * addTenant
     * 
     * @param tenant tenant (required)
     * @return PrimitiveResultstring
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrimitiveResultstring addTenantUsingPOST(TenantRequestDTO tenant) throws ApiException {
        ApiResponse<PrimitiveResultstring> resp = addTenantUsingPOSTWithHttpInfo(tenant);
        return resp.getData();
    }

    /**
     * addTenant
     * 
     * @param tenant tenant (required)
     * @return ApiResponse&lt;PrimitiveResultstring&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrimitiveResultstring> addTenantUsingPOSTWithHttpInfo(TenantRequestDTO tenant) throws ApiException {
        com.squareup.okhttp.Call call = addTenantUsingPOSTCall(tenant, null, null);
        Type localVarReturnType = new TypeToken<PrimitiveResultstring>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * addTenant (asynchronously)
     * 
     * @param tenant tenant (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTenantUsingPOSTAsync(TenantRequestDTO tenant, final ApiCallback<PrimitiveResultstring> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addTenantUsingPOSTCall(tenant, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PrimitiveResultstring>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deactivateTenantUsingPOST */
    private com.squareup.okhttp.Call deactivateTenantUsingPOSTCall(TenantDomainDTO tenantDomainDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tenantDomainDTO;
        
        // verify the required parameter 'tenantDomainDTO' is set
        if (tenantDomainDTO == null) {
            throw new ApiException("Missing the required parameter 'tenantDomainDTO' when calling deactivateTenantUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/TenantService/deactivateTenant".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "default" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * deactivateTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deactivateTenantUsingPOST(TenantDomainDTO tenantDomainDTO) throws ApiException {
        deactivateTenantUsingPOSTWithHttpInfo(tenantDomainDTO);
    }

    /**
     * deactivateTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deactivateTenantUsingPOSTWithHttpInfo(TenantDomainDTO tenantDomainDTO) throws ApiException {
        com.squareup.okhttp.Call call = deactivateTenantUsingPOSTCall(tenantDomainDTO, null, null);
        return apiClient.execute(call);
    }

    /**
     * deactivateTenant (asynchronously)
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deactivateTenantUsingPOSTAsync(TenantDomainDTO tenantDomainDTO, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deactivateTenantUsingPOSTCall(tenantDomainDTO, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteTenantUsingPOST */
    private com.squareup.okhttp.Call deleteTenantUsingPOSTCall(TenantDomainDTO tenantDomainDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tenantDomainDTO;
        
        // verify the required parameter 'tenantDomainDTO' is set
        if (tenantDomainDTO == null) {
            throw new ApiException("Missing the required parameter 'tenantDomainDTO' when calling deleteTenantUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/TenantService/deleteTenant".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "default" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * deleteTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTenantUsingPOST(TenantDomainDTO tenantDomainDTO) throws ApiException {
        deleteTenantUsingPOSTWithHttpInfo(tenantDomainDTO);
    }

    /**
     * deleteTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTenantUsingPOSTWithHttpInfo(TenantDomainDTO tenantDomainDTO) throws ApiException {
        com.squareup.okhttp.Call call = deleteTenantUsingPOSTCall(tenantDomainDTO, null, null);
        return apiClient.execute(call);
    }

    /**
     * deleteTenant (asynchronously)
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTenantUsingPOSTAsync(TenantDomainDTO tenantDomainDTO, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTenantUsingPOSTCall(tenantDomainDTO, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getAllTenantsUsingGET */
    private com.squareup.okhttp.Call getAllTenantsUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/api/TenantService/getAllTenants".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "default" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * getAllTenants
     * 
     * @return List&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Tenant> getAllTenantsUsingGET() throws ApiException {
        ApiResponse<List<Tenant>> resp = getAllTenantsUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * getAllTenants
     * 
     * @return ApiResponse&lt;List&lt;Tenant&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Tenant>> getAllTenantsUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllTenantsUsingGETCall(null, null);
        Type localVarReturnType = new TypeToken<List<Tenant>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getAllTenants (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllTenantsUsingGETAsync(final ApiCallback<List<Tenant>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllTenantsUsingGETCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Tenant>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTenantUsingPOST */
    private com.squareup.okhttp.Call getTenantUsingPOSTCall(TenantDomainDTO tenantDomainDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tenantDomainDTO;
        
        // verify the required parameter 'tenantDomainDTO' is set
        if (tenantDomainDTO == null) {
            throw new ApiException("Missing the required parameter 'tenantDomainDTO' when calling getTenantUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/TenantService/getTenant".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "default" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * getTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @return Tenant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tenant getTenantUsingPOST(TenantDomainDTO tenantDomainDTO) throws ApiException {
        ApiResponse<Tenant> resp = getTenantUsingPOSTWithHttpInfo(tenantDomainDTO);
        return resp.getData();
    }

    /**
     * getTenant
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @return ApiResponse&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tenant> getTenantUsingPOSTWithHttpInfo(TenantDomainDTO tenantDomainDTO) throws ApiException {
        com.squareup.okhttp.Call call = getTenantUsingPOSTCall(tenantDomainDTO, null, null);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getTenant (asynchronously)
     * 
     * @param tenantDomainDTO tenantDomainDTO (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTenantUsingPOSTAsync(TenantDomainDTO tenantDomainDTO, final ApiCallback<Tenant> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTenantUsingPOSTCall(tenantDomainDTO, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTenantUsingPOST */
    private com.squareup.okhttp.Call updateTenantUsingPOSTCall(TenantRequestDTO tenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tenant;
        
        // verify the required parameter 'tenant' is set
        if (tenant == null) {
            throw new ApiException("Missing the required parameter 'tenant' when calling updateTenantUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/TenantService/updateTenant".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "default" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * updateTenant
     * 
     * @param tenant tenant (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateTenantUsingPOST(TenantRequestDTO tenant) throws ApiException {
        updateTenantUsingPOSTWithHttpInfo(tenant);
    }

    /**
     * updateTenant
     * 
     * @param tenant tenant (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateTenantUsingPOSTWithHttpInfo(TenantRequestDTO tenant) throws ApiException {
        com.squareup.okhttp.Call call = updateTenantUsingPOSTCall(tenant, null, null);
        return apiClient.execute(call);
    }

    /**
     * updateTenant (asynchronously)
     * 
     * @param tenant tenant (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTenantUsingPOSTAsync(TenantRequestDTO tenant, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateTenantUsingPOSTCall(tenant, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
