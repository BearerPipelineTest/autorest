/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import org.joda.time.LocalDate;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Dates.
 */
public interface Dates {
    /**
     * Get null date value.
     *
     * @return the LocalDate object if successful.
     */
    LocalDate getNull();

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LocalDate> getNullAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get null date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<LocalDate> getNullAsync();

    /**
     * Get null date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<ServiceResponse<LocalDate>> getNullWithServiceResponseAsync();

    /**
     * Get invalid date value.
     *
     * @return the LocalDate object if successful.
     */
    LocalDate getInvalidDate();

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LocalDate> getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get invalid date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<LocalDate> getInvalidDateAsync();

    /**
     * Get invalid date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<ServiceResponse<LocalDate>> getInvalidDateWithServiceResponseAsync();

    /**
     * Get overflow date value.
     *
     * @return the LocalDate object if successful.
     */
    LocalDate getOverflowDate();

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LocalDate> getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get overflow date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<LocalDate> getOverflowDateAsync();

    /**
     * Get overflow date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<ServiceResponse<LocalDate>> getOverflowDateWithServiceResponseAsync();

    /**
     * Get underflow date value.
     *
     * @return the LocalDate object if successful.
     */
    LocalDate getUnderflowDate();

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LocalDate> getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get underflow date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<LocalDate> getUnderflowDateAsync();

    /**
     * Get underflow date value.
     *
     * @return the observable to the LocalDate object
     */
    Observable<ServiceResponse<LocalDate>> getUnderflowDateWithServiceResponseAsync();

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     */
    void putMaxDate(LocalDate dateBody);

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putMaxDateAsync(LocalDate dateBody);

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putMaxDateWithServiceResponseAsync(LocalDate dateBody);

    /**
     * Get max date value 9999-12-31.
     *
     * @return the LocalDate object if successful.
     */
    LocalDate getMaxDate();

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LocalDate> getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get max date value 9999-12-31.
     *
     * @return the observable to the LocalDate object
     */
    Observable<LocalDate> getMaxDateAsync();

    /**
     * Get max date value 9999-12-31.
     *
     * @return the observable to the LocalDate object
     */
    Observable<ServiceResponse<LocalDate>> getMaxDateWithServiceResponseAsync();

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     */
    void putMinDate(LocalDate dateBody);

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putMinDateAsync(LocalDate dateBody);

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putMinDateWithServiceResponseAsync(LocalDate dateBody);

    /**
     * Get min date value 0000-01-01.
     *
     * @return the LocalDate object if successful.
     */
    LocalDate getMinDate();

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LocalDate> getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get min date value 0000-01-01.
     *
     * @return the observable to the LocalDate object
     */
    Observable<LocalDate> getMinDateAsync();

    /**
     * Get min date value 0000-01-01.
     *
     * @return the observable to the LocalDate object
     */
    Observable<ServiceResponse<LocalDate>> getMinDateWithServiceResponseAsync();

}
