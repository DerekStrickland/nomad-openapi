/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The DispatchPayloadConfig model module.
 * @module model/DispatchPayloadConfig
 * @version 1.1.4
 */
class DispatchPayloadConfig {
    /**
     * Constructs a new <code>DispatchPayloadConfig</code>.
     * @alias module:model/DispatchPayloadConfig
     */
    constructor() { 
        
        DispatchPayloadConfig.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DispatchPayloadConfig</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DispatchPayloadConfig} obj Optional instance to populate.
     * @return {module:model/DispatchPayloadConfig} The populated <code>DispatchPayloadConfig</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DispatchPayloadConfig();

            if (data.hasOwnProperty('File')) {
                obj['File'] = ApiClient.convertToType(data['File'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} File
 */
DispatchPayloadConfig.prototype['File'] = undefined;






export default DispatchPayloadConfig;
