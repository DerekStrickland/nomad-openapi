/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class MultiregionRegion {
    'count'?: number;
    'datacenters'?: Array<string>;
    'meta'?: { [key: string]: string; };
    'name'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "count",
            "baseName": "Count",
            "type": "number",
            "format": ""
        },
        {
            "name": "datacenters",
            "baseName": "Datacenters",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "meta",
            "baseName": "Meta",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "Name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MultiregionRegion.attributeTypeMap;
    }
    
    public constructor() {
    }
}
