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
import FuzzyMatch from './FuzzyMatch';

/**
 * The FuzzySearchResponse model module.
 * @module model/FuzzySearchResponse
 * @version 1.1.4
 */
class FuzzySearchResponse {
    /**
     * Constructs a new <code>FuzzySearchResponse</code>.
     * @alias module:model/FuzzySearchResponse
     */
    constructor() { 
        
        FuzzySearchResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FuzzySearchResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FuzzySearchResponse} obj Optional instance to populate.
     * @return {module:model/FuzzySearchResponse} The populated <code>FuzzySearchResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FuzzySearchResponse();

            if (data.hasOwnProperty('KnownLeader')) {
                obj['KnownLeader'] = ApiClient.convertToType(data['KnownLeader'], 'Boolean');
            }
            if (data.hasOwnProperty('LastContact')) {
                obj['LastContact'] = ApiClient.convertToType(data['LastContact'], 'Number');
            }
            if (data.hasOwnProperty('LastIndex')) {
                obj['LastIndex'] = ApiClient.convertToType(data['LastIndex'], 'Number');
            }
            if (data.hasOwnProperty('Matches')) {
                obj['Matches'] = ApiClient.convertToType(data['Matches'], {'String': [FuzzyMatch]});
            }
            if (data.hasOwnProperty('RequestTime')) {
                obj['RequestTime'] = ApiClient.convertToType(data['RequestTime'], 'Number');
            }
            if (data.hasOwnProperty('Truncations')) {
                obj['Truncations'] = ApiClient.convertToType(data['Truncations'], {'String': 'Boolean'});
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} KnownLeader
 */
FuzzySearchResponse.prototype['KnownLeader'] = undefined;

/**
 * @member {Number} LastContact
 */
FuzzySearchResponse.prototype['LastContact'] = undefined;

/**
 * @member {Number} LastIndex
 */
FuzzySearchResponse.prototype['LastIndex'] = undefined;

/**
 * @member {Object.<String, Array.<module:model/FuzzyMatch>>} Matches
 */
FuzzySearchResponse.prototype['Matches'] = undefined;

/**
 * @member {Number} RequestTime
 */
FuzzySearchResponse.prototype['RequestTime'] = undefined;

/**
 * @member {Object.<String, Boolean>} Truncations
 */
FuzzySearchResponse.prototype['Truncations'] = undefined;






export default FuzzySearchResponse;
