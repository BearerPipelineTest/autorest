/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger.implementation;

import retrofit2.Retrofit;
import fixtures.bodyinteger.Ints;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Ints.
 */
public class IntsImpl implements Ints {
    /** The Retrofit service to perform REST calls. */
    private IntsService service;
    /** The service client containing this operation class. */
    private AutoRestIntegerTestServiceImpl client;

    /**
     * Initializes an instance of Ints.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntsImpl(Retrofit retrofit, AutoRestIntegerTestServiceImpl client) {
        this.service = retrofit.create(IntsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Ints to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getNull" })
        @GET("int/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getInvalid" })
        @GET("int/invalid")
        Observable<Response<ResponseBody>> getInvalid();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getOverflowInt32" })
        @GET("int/overflowint32")
        Observable<Response<ResponseBody>> getOverflowInt32();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getUnderflowInt32" })
        @GET("int/underflowint32")
        Observable<Response<ResponseBody>> getUnderflowInt32();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getOverflowInt64" })
        @GET("int/overflowint64")
        Observable<Response<ResponseBody>> getOverflowInt64();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getUnderflowInt64" })
        @GET("int/underflowint64")
        Observable<Response<ResponseBody>> getUnderflowInt64();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints putMax32" })
        @PUT("int/max/32")
        Observable<Response<ResponseBody>> putMax32(@Body int intBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints putMax64" })
        @PUT("int/max/64")
        Observable<Response<ResponseBody>> putMax64(@Body long intBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints putMin32" })
        @PUT("int/min/32")
        Observable<Response<ResponseBody>> putMin32(@Body int intBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints putMin64" })
        @PUT("int/min/64")
        Observable<Response<ResponseBody>> putMin64(@Body long intBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getUnixTime" })
        @GET("int/unixtime")
        Observable<Response<ResponseBody>> getUnixTime();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints putUnixTimeDate" })
        @PUT("int/unixtime")
        Observable<Response<ResponseBody>> putUnixTimeDate(@Body long intBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getInvalidUnixTime" })
        @GET("int/invalidunixtime")
        Observable<Response<ResponseBody>> getInvalidUnixTime();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodyinteger.Ints getNullUnixTime" })
        @GET("int/nullunixtime")
        Observable<Response<ResponseBody>> getNullUnixTime();

    }

    /**
     * Get null Int value.
     *
     * @return the int object if successful.
     */
    public int getNull() {
        return getNullWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getNullAsync(final ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromResponse(getNullWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get null Int value.
     *
     * @return the observable to the Integer object
     */
    public Observable<Integer> getNullAsync() {
        return getNullWithServiceResponseAsync().map(new Func1<ServiceResponse<Integer>, Integer>() {
            @Override
            public Integer call(ServiceResponse<Integer> response) {
                return response.body();
            }
        });
    }

    /**
     * Get null Int value.
     *
     * @return the observable to the Integer object
     */
    public Observable<ServiceResponse<Integer>> getNullWithServiceResponseAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Integer> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Integer, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid Int value.
     *
     * @return the int object if successful.
     */
    public int getInvalid() {
        return getInvalidWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getInvalidAsync(final ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromResponse(getInvalidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get invalid Int value.
     *
     * @return the observable to the Integer object
     */
    public Observable<Integer> getInvalidAsync() {
        return getInvalidWithServiceResponseAsync().map(new Func1<ServiceResponse<Integer>, Integer>() {
            @Override
            public Integer call(ServiceResponse<Integer> response) {
                return response.body();
            }
        });
    }

    /**
     * Get invalid Int value.
     *
     * @return the observable to the Integer object
     */
    public Observable<ServiceResponse<Integer>> getInvalidWithServiceResponseAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getInvalidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Integer> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Integer, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int32 value.
     *
     * @return the int object if successful.
     */
    public int getOverflowInt32() {
        return getOverflowInt32WithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromResponse(getOverflowInt32WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get overflow Int32 value.
     *
     * @return the observable to the Integer object
     */
    public Observable<Integer> getOverflowInt32Async() {
        return getOverflowInt32WithServiceResponseAsync().map(new Func1<ServiceResponse<Integer>, Integer>() {
            @Override
            public Integer call(ServiceResponse<Integer> response) {
                return response.body();
            }
        });
    }

    /**
     * Get overflow Int32 value.
     *
     * @return the observable to the Integer object
     */
    public Observable<ServiceResponse<Integer>> getOverflowInt32WithServiceResponseAsync() {
        return service.getOverflowInt32()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getOverflowInt32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Integer> getOverflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Integer, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int32 value.
     *
     * @return the int object if successful.
     */
    public int getUnderflowInt32() {
        return getUnderflowInt32WithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromResponse(getUnderflowInt32WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get underflow Int32 value.
     *
     * @return the observable to the Integer object
     */
    public Observable<Integer> getUnderflowInt32Async() {
        return getUnderflowInt32WithServiceResponseAsync().map(new Func1<ServiceResponse<Integer>, Integer>() {
            @Override
            public Integer call(ServiceResponse<Integer> response) {
                return response.body();
            }
        });
    }

    /**
     * Get underflow Int32 value.
     *
     * @return the observable to the Integer object
     */
    public Observable<ServiceResponse<Integer>> getUnderflowInt32WithServiceResponseAsync() {
        return service.getUnderflowInt32()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Integer>>>() {
                @Override
                public Observable<ServiceResponse<Integer>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Integer> clientResponse = getUnderflowInt32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Integer> getUnderflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Integer, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int64 value.
     *
     * @return the long object if successful.
     */
    public long getOverflowInt64() {
        return getOverflowInt64WithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Long> getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        return ServiceFuture.fromResponse(getOverflowInt64WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get overflow Int64 value.
     *
     * @return the observable to the Long object
     */
    public Observable<Long> getOverflowInt64Async() {
        return getOverflowInt64WithServiceResponseAsync().map(new Func1<ServiceResponse<Long>, Long>() {
            @Override
            public Long call(ServiceResponse<Long> response) {
                return response.body();
            }
        });
    }

    /**
     * Get overflow Int64 value.
     *
     * @return the observable to the Long object
     */
    public Observable<ServiceResponse<Long>> getOverflowInt64WithServiceResponseAsync() {
        return service.getOverflowInt64()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Long>>>() {
                @Override
                public Observable<ServiceResponse<Long>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> clientResponse = getOverflowInt64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Long> getOverflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Long, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int64 value.
     *
     * @return the long object if successful.
     */
    public long getUnderflowInt64() {
        return getUnderflowInt64WithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Long> getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        return ServiceFuture.fromResponse(getUnderflowInt64WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get underflow Int64 value.
     *
     * @return the observable to the Long object
     */
    public Observable<Long> getUnderflowInt64Async() {
        return getUnderflowInt64WithServiceResponseAsync().map(new Func1<ServiceResponse<Long>, Long>() {
            @Override
            public Long call(ServiceResponse<Long> response) {
                return response.body();
            }
        });
    }

    /**
     * Get underflow Int64 value.
     *
     * @return the observable to the Long object
     */
    public Observable<ServiceResponse<Long>> getUnderflowInt64WithServiceResponseAsync() {
        return service.getUnderflowInt64()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Long>>>() {
                @Override
                public Observable<ServiceResponse<Long>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> clientResponse = getUnderflowInt64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Long> getUnderflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Long, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     */
    public void putMax32(int intBody) {
        putMax32WithServiceResponseAsync(intBody).toBlocking().single().body();
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putMax32WithServiceResponseAsync(intBody), serviceCallback);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putMax32Async(int intBody) {
        return putMax32WithServiceResponseAsync(intBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMax32WithServiceResponseAsync(int intBody) {
        return service.putMax32(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMax32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putMax32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     */
    public void putMax64(long intBody) {
        putMax64WithServiceResponseAsync(intBody).toBlocking().single().body();
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putMax64WithServiceResponseAsync(intBody), serviceCallback);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putMax64Async(long intBody) {
        return putMax64WithServiceResponseAsync(intBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMax64WithServiceResponseAsync(long intBody) {
        return service.putMax64(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMax64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putMax64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     */
    public void putMin32(int intBody) {
        putMin32WithServiceResponseAsync(intBody).toBlocking().single().body();
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putMin32WithServiceResponseAsync(intBody), serviceCallback);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putMin32Async(int intBody) {
        return putMin32WithServiceResponseAsync(intBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMin32WithServiceResponseAsync(int intBody) {
        return service.putMin32(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMin32Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putMin32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     */
    public void putMin64(long intBody) {
        putMin64WithServiceResponseAsync(intBody).toBlocking().single().body();
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putMin64WithServiceResponseAsync(intBody), serviceCallback);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putMin64Async(long intBody) {
        return putMin64WithServiceResponseAsync(intBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putMin64WithServiceResponseAsync(long intBody) {
        return service.putMin64(intBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putMin64Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putMin64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getUnixTime() {
        return getUnixTimeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getUnixTimeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getUnixTimeAsync() {
        return getUnixTimeWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUnixTimeWithServiceResponseAsync() {
        return service.getUnixTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> result = getUnixTimeDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = new DateTime(result.body() * 1000L, DateTimeZone.UTC);
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Long> getUnixTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Long, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     */
    public void putUnixTimeDate(DateTime intBody) {
        putUnixTimeDateWithServiceResponseAsync(intBody).toBlocking().single().body();
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putUnixTimeDateAsync(DateTime intBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putUnixTimeDateWithServiceResponseAsync(intBody), serviceCallback);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putUnixTimeDateAsync(DateTime intBody) {
        return putUnixTimeDateWithServiceResponseAsync(intBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putUnixTimeDateWithServiceResponseAsync(DateTime intBody) {
        Long intBodyConverted = intBody.toDateTime(DateTimeZone.UTC).getMillis() / 1000;
        return service.putUnixTimeDate(intBodyConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putUnixTimeDateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putUnixTimeDateDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid Unix time value.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getInvalidUnixTime() {
        return getInvalidUnixTimeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get invalid Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getInvalidUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getInvalidUnixTimeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get invalid Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getInvalidUnixTimeAsync() {
        return getInvalidUnixTimeWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get invalid Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getInvalidUnixTimeWithServiceResponseAsync() {
        return service.getInvalidUnixTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> result = getInvalidUnixTimeDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = new DateTime(result.body() * 1000L, DateTimeZone.UTC);
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Long> getInvalidUnixTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Long, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get null Unix time value.
     *
     * @return the DateTime object if successful.
     */
    public DateTime getNullUnixTime() {
        return getNullUnixTimeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get null Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getNullUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromResponse(getNullUnixTimeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get null Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<DateTime> getNullUnixTimeAsync() {
        return getNullUnixTimeWithServiceResponseAsync().map(new Func1<ServiceResponse<DateTime>, DateTime>() {
            @Override
            public DateTime call(ServiceResponse<DateTime> response) {
                return response.body();
            }
        });
    }

    /**
     * Get null Unix time value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getNullUnixTimeWithServiceResponseAsync() {
        return service.getNullUnixTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> result = getNullUnixTimeDelegate(response);
                        DateTime body = null;
                        if (result.body() != null) {
                            body = new DateTime(result.body() * 1000L, DateTimeZone.UTC);
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Long> getNullUnixTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Long, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
