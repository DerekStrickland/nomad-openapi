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

export class RaftServer {
    'address'?: string;
    'ID'?: string;
    'leader'?: boolean;
    'node'?: string;
    'raftProtocol'?: string;
    'voter'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "address",
            "baseName": "Address",
            "type": "string",
            "format": ""
        },
        {
            "name": "ID",
            "baseName": "ID",
            "type": "string",
            "format": ""
        },
        {
            "name": "leader",
            "baseName": "Leader",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "node",
            "baseName": "Node",
            "type": "string",
            "format": ""
        },
        {
            "name": "raftProtocol",
            "baseName": "RaftProtocol",
            "type": "string",
            "format": ""
        },
        {
            "name": "voter",
            "baseName": "Voter",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RaftServer.attributeTypeMap;
    }
    
    public constructor() {
    }
}
