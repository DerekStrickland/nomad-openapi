"""
    Nomad

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.1.4
    Contact: support@hashicorp.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.api_client import ApiClient, Endpoint as _Endpoint
from openapi_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from openapi_client.model.allocation_list_stub import AllocationListStub
from openapi_client.model.evaluation import Evaluation


class EvaluationsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __get_evaluation(
            self,
            eval_id,
            **kwargs
        ):
            """get_evaluation  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_evaluation(eval_id, async_req=True)
            >>> result = thread.get()

            Args:
                eval_id (str): Evaluation ID.

            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                index (int): If set, wait until query exceeds given index. Must be provided with WaitParam.. [optional]
                wait (str): Provided with IndexParam to wait for change.. [optional]
                stale (str): If present, results will include stale reads.. [optional]
                prefix (str): Constrains results to jobs that start with the defined prefix. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                per_page (int): Maximum number of results to return.. [optional]
                next_token (str): Indicates where to start paging for queries that support pagination.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                Evaluation
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['eval_id'] = \
                eval_id
            return self.call_with_http_info(**kwargs)

        self.get_evaluation = _Endpoint(
            settings={
                'response_type': (Evaluation,),
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/evaluation/{evalID}',
                'operation_id': 'get_evaluation',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'eval_id',
                    'region',
                    'namespace',
                    'index',
                    'wait',
                    'stale',
                    'prefix',
                    'x_nomad_token',
                    'per_page',
                    'next_token',
                ],
                'required': [
                    'eval_id',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'eval_id':
                        (str,),
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'index':
                        (int,),
                    'wait':
                        (str,),
                    'stale':
                        (str,),
                    'prefix':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'per_page':
                        (int,),
                    'next_token':
                        (str,),
                },
                'attribute_map': {
                    'eval_id': 'evalID',
                    'region': 'region',
                    'namespace': 'namespace',
                    'index': 'index',
                    'wait': 'wait',
                    'stale': 'stale',
                    'prefix': 'prefix',
                    'x_nomad_token': 'X-Nomad-Token',
                    'per_page': 'per_page',
                    'next_token': 'next_token',
                },
                'location_map': {
                    'eval_id': 'path',
                    'region': 'query',
                    'namespace': 'query',
                    'index': 'header',
                    'wait': 'query',
                    'stale': 'query',
                    'prefix': 'query',
                    'x_nomad_token': 'header',
                    'per_page': 'query',
                    'next_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_evaluation
        )

        def __get_evaluation_allocations(
            self,
            eval_id,
            **kwargs
        ):
            """get_evaluation_allocations  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_evaluation_allocations(eval_id, async_req=True)
            >>> result = thread.get()

            Args:
                eval_id (str): Evaluation ID.

            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                index (int): If set, wait until query exceeds given index. Must be provided with WaitParam.. [optional]
                wait (str): Provided with IndexParam to wait for change.. [optional]
                stale (str): If present, results will include stale reads.. [optional]
                prefix (str): Constrains results to jobs that start with the defined prefix. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                per_page (int): Maximum number of results to return.. [optional]
                next_token (str): Indicates where to start paging for queries that support pagination.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                [AllocationListStub]
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['eval_id'] = \
                eval_id
            return self.call_with_http_info(**kwargs)

        self.get_evaluation_allocations = _Endpoint(
            settings={
                'response_type': ([AllocationListStub],),
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/evaluation/{evalID}/allocations',
                'operation_id': 'get_evaluation_allocations',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'eval_id',
                    'region',
                    'namespace',
                    'index',
                    'wait',
                    'stale',
                    'prefix',
                    'x_nomad_token',
                    'per_page',
                    'next_token',
                ],
                'required': [
                    'eval_id',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'eval_id':
                        (str,),
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'index':
                        (int,),
                    'wait':
                        (str,),
                    'stale':
                        (str,),
                    'prefix':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'per_page':
                        (int,),
                    'next_token':
                        (str,),
                },
                'attribute_map': {
                    'eval_id': 'evalID',
                    'region': 'region',
                    'namespace': 'namespace',
                    'index': 'index',
                    'wait': 'wait',
                    'stale': 'stale',
                    'prefix': 'prefix',
                    'x_nomad_token': 'X-Nomad-Token',
                    'per_page': 'per_page',
                    'next_token': 'next_token',
                },
                'location_map': {
                    'eval_id': 'path',
                    'region': 'query',
                    'namespace': 'query',
                    'index': 'header',
                    'wait': 'query',
                    'stale': 'query',
                    'prefix': 'query',
                    'x_nomad_token': 'header',
                    'per_page': 'query',
                    'next_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_evaluation_allocations
        )

        def __get_evaluations(
            self,
            **kwargs
        ):
            """get_evaluations  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_evaluations(async_req=True)
            >>> result = thread.get()


            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                index (int): If set, wait until query exceeds given index. Must be provided with WaitParam.. [optional]
                wait (str): Provided with IndexParam to wait for change.. [optional]
                stale (str): If present, results will include stale reads.. [optional]
                prefix (str): Constrains results to jobs that start with the defined prefix. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                per_page (int): Maximum number of results to return.. [optional]
                next_token (str): Indicates where to start paging for queries that support pagination.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                [Evaluation]
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            return self.call_with_http_info(**kwargs)

        self.get_evaluations = _Endpoint(
            settings={
                'response_type': ([Evaluation],),
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/evaluations',
                'operation_id': 'get_evaluations',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'region',
                    'namespace',
                    'index',
                    'wait',
                    'stale',
                    'prefix',
                    'x_nomad_token',
                    'per_page',
                    'next_token',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'index':
                        (int,),
                    'wait':
                        (str,),
                    'stale':
                        (str,),
                    'prefix':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'per_page':
                        (int,),
                    'next_token':
                        (str,),
                },
                'attribute_map': {
                    'region': 'region',
                    'namespace': 'namespace',
                    'index': 'index',
                    'wait': 'wait',
                    'stale': 'stale',
                    'prefix': 'prefix',
                    'x_nomad_token': 'X-Nomad-Token',
                    'per_page': 'per_page',
                    'next_token': 'next_token',
                },
                'location_map': {
                    'region': 'query',
                    'namespace': 'query',
                    'index': 'header',
                    'wait': 'query',
                    'stale': 'query',
                    'prefix': 'query',
                    'x_nomad_token': 'header',
                    'per_page': 'query',
                    'next_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_evaluations
        )