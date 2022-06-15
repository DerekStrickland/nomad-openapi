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

import { FuzzyMatch } from './FuzzyMatch';
import { HttpFile } from '../http/http';

export class FuzzySearchResponse {
    'knownLeader'?: boolean;
    'lastContact'?: number;
    'lastIndex'?: number;
    'matches'?: { [key: string]: Array<FuzzyMatch>; };
    'nextToken'?: string;
    'requestTime'?: number;
    'truncations'?: { [key: string]: boolean; };

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "knownLeader",
            "baseName": "KnownLeader",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "lastContact",
            "baseName": "LastContact",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "lastIndex",
            "baseName": "LastIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "matches",
            "baseName": "Matches",
            "type": "{ [key: string]: Array<FuzzyMatch>; }",
            "format": ""
        },
        {
            "name": "nextToken",
            "baseName": "NextToken",
            "type": "string",
            "format": ""
        },
        {
            "name": "requestTime",
            "baseName": "RequestTime",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "truncations",
            "baseName": "Truncations",
            "type": "{ [key: string]: boolean; }",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FuzzySearchResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

