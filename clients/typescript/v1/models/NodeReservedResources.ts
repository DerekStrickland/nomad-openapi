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

import { NodeReservedCpuResources } from './NodeReservedCpuResources';
import { NodeReservedDiskResources } from './NodeReservedDiskResources';
import { NodeReservedMemoryResources } from './NodeReservedMemoryResources';
import { NodeReservedNetworkResources } from './NodeReservedNetworkResources';
import { HttpFile } from '../http/http';

export class NodeReservedResources {
    'cpu'?: NodeReservedCpuResources;
    'disk'?: NodeReservedDiskResources;
    'memory'?: NodeReservedMemoryResources;
    'networks'?: NodeReservedNetworkResources;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cpu",
            "baseName": "Cpu",
            "type": "NodeReservedCpuResources",
            "format": ""
        },
        {
            "name": "disk",
            "baseName": "Disk",
            "type": "NodeReservedDiskResources",
            "format": ""
        },
        {
            "name": "memory",
            "baseName": "Memory",
            "type": "NodeReservedMemoryResources",
            "format": ""
        },
        {
            "name": "networks",
            "baseName": "Networks",
            "type": "NodeReservedNetworkResources",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return NodeReservedResources.attributeTypeMap;
    }
    
    public constructor() {
    }
}
