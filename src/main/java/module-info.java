/*
 * Copyright 2013-2026 Erudika. http://erudika.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For issues and patches go to: https://github.com/erudika
 */
/**
 * AWSFileStore.
 */
module com.erudika.para.server.storage.s3fs {
	requires com.erudika.para.core;
	requires org.apache.commons.lang3;
	requires com.fasterxml.jackson.databind;
	requires org.slf4j;
	requires software.amazon.awssdk.auth;
	requires software.amazon.awssdk.core;
	requires software.amazon.awssdk.regions;
	requires software.amazon.awssdk.services.sts;
	requires software.amazon.awssdk.services.s3;
	exports com.erudika.para.server.storage;
	provides com.erudika.para.core.storage.FileStore with com.erudika.para.server.storage.AWSFileStore;
}