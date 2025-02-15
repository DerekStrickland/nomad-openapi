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
 * The Variable model module.
 * @module model/Variable
 * @version 1.1.4
 */
class Variable {
    /**
     * Constructs a new <code>Variable</code>.
     * @alias module:model/Variable
     */
    constructor() { 
        
        Variable.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Variable</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Variable} obj Optional instance to populate.
     * @return {module:model/Variable} The populated <code>Variable</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Variable();

            if (data.hasOwnProperty('CreateIndex')) {
                obj['CreateIndex'] = ApiClient.convertToType(data['CreateIndex'], 'Number');
            }
            if (data.hasOwnProperty('CreateTime')) {
                obj['CreateTime'] = ApiClient.convertToType(data['CreateTime'], 'Number');
            }
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], {'String': 'String'});
            }
            if (data.hasOwnProperty('ModifyIndex')) {
                obj['ModifyIndex'] = ApiClient.convertToType(data['ModifyIndex'], 'Number');
            }
            if (data.hasOwnProperty('ModifyTime')) {
                obj['ModifyTime'] = ApiClient.convertToType(data['ModifyTime'], 'Number');
            }
            if (data.hasOwnProperty('Namespace')) {
                obj['Namespace'] = ApiClient.convertToType(data['Namespace'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} CreateIndex
 */
Variable.prototype['CreateIndex'] = undefined;

/**
 * @member {Number} CreateTime
 */
Variable.prototype['CreateTime'] = undefined;

/**
 * @member {Object.<String, String>} Items
 */
Variable.prototype['Items'] = undefined;

/**
 * @member {Number} ModifyIndex
 */
Variable.prototype['ModifyIndex'] = undefined;

/**
 * @member {Number} ModifyTime
 */
Variable.prototype['ModifyTime'] = undefined;

/**
 * @member {String} Namespace
 */
Variable.prototype['Namespace'] = undefined;

/**
 * @member {String} Path
 */
Variable.prototype['Path'] = undefined;






export default Variable;

