<?php

use PHPUnit\Framework\TestCase;

class OddEvenTest extends TestCase
{
    private $result;

    protected function setUp(): void
    { {
            $this->result = true;
        }
    }
    public function testFalse()
    {
        $this->result=false;
        $this->assertFalse( $this->result);
    }

    public function testtrue()
    {
        $this->assertTrue( $this->result);
    }

    protected function tearDown(): void
    { {
            $this->result = null;
        }
    }
}